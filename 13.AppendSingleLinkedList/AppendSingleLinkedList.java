/*
 * javac *.java 
 * Java AppendSingleLinkedList
*/

public class AppendSingleLinkedList 
{
        private static Node head;
        private static Node tail;
        
        public static Node init()
        {
                head = new Node("A",null);
                
                Node nodeB = new Node("B",null);
                head.next = nodeB;

                Node nodeC = new Node("C",null);
                nodeB.next = nodeC;

                tail = new Node("D",null);
                nodeC.next = tail;

                return head;
        }

        public static void add(Node newNode)
        {
                tail.next=newNode;
                tail=newNode;
        }

        public static void print()
        {
                Node p = head;
                while(p != null)
                {
                        System.out.println(p.data);
                        p=p.next;
                }
        }

        public static void main(String[]args)
        {
                init();
                System.out.println("Append a new node name 'E'to the end:");
                add(new Node("E", null));

                print();
        }
}        
