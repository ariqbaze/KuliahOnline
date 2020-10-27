class LinkedList {
    internal var head: Node? = null

    internal class Node
        (var data: Int) {
        var next: Node? = null

    }
    companion object {

        fun insert(list: LinkedList, data: Int): LinkedList {
            val new_node = Node(data)
            new_node.next = null
            if (list.head == null) {
                list.head = new_node
            } else {
                var last = list.head
                while (last!!.next != null) {
                    last = last.next
                }
                last.next = new_node
            }
            return list
        }

        fun printList(list: LinkedList) {
            var currNode = list.head
            print("LinkedList: ")
            while (currNode != null) {
                print(currNode.data.toString() + " ")
                currNode = currNode.next
            }
        }

        @JvmStatic
        fun main(args: Array<String>) { /* Start with the empty list. */
            var list = LinkedList()

            list = insert(list, 1)
            list = insert(list, 2)
            list = insert(list, 3)
            list = insert(list, 4)
            list = insert(list, 5)
            list = insert(list, 6)
            list = insert(list, 7)
            list = insert(list, 8)

            printList(list)
        }
    }
}