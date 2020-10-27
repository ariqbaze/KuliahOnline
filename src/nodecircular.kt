class CreateList {
    inner class Node(var data: Int) {
        var next: Node? = null
    }
    var head: Node? = null
    var tail: Node? = null
    fun add(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            tail = newNode
            newNode.next = head
        } else {
            tail!!.next = newNode
            tail = newNode
            tail!!.next = head
        }
    }

    fun display() {
        var current = head
        if (head == null) {
            println("List is empty")
        } else {
            println("Nodes of the circular linked list: ")
            do {
                print(" " + current!!.data)
                current = current.next
            } while (current !== head)
            println()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val cl = CreateList()
            cl.add(1)
            cl.add(2)
            cl.add(3)
            cl.add(4)
            cl.display()
        }
    }
}