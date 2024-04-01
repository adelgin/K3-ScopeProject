import java.util.*

class ScopeValidator(private val ScopeStr : String) {
    private val openScopeMap = mapOf('{' to '}', '(' to ')', '[' to ']', '<' to '>')
    private var openScopeStack = Stack<Char>()
    fun validate() : Boolean {
        for (i in ScopeStr) {
            if (openScopeMap.containsKey(i)) {
                openScopeStack.push(i)
            }
            if (openScopeMap.containsValue(i)) {
                if (i == openScopeMap[openScopeStack.peek()]) {
                    openScopeStack.pop()
                }
            }
        }
        if (openScopeStack.isEmpty()) {
            return true
        }
        return false
    }
}