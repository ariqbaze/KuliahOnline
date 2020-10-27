class DLL {
    var head
            : Node? = null

    inner class Node
        (var data: Int) {
        var prev: Node? = null
        var next: Node? = null

    }

    fun append(new_data: Int) {
        val new_node = Node(new_data)
        var last = head
        new_node.next = null
        if (head == null) {
            new_node.prev = null
            head = new_node
            return
        }
        while (last!!.next != null) last = last.next
        last.next = new_node
        new_node.prev = last
    }

    fun printlist(node: Node?) {
        var node = node
        var last: Node? = null
        while (node != null) {
            print(node.data.toString() + " ")
            last = node
            node = node.next
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val dll = DLL()
            dll.append(6)
            dll.append(5)
            dll.append(4)
            dll.append(3)
            dll.append(2)
            dll.append(1)
            println("Created DLL is: ")
            dll.printlist(dll.head)
        }
    }
}