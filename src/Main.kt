//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scope = ScopeValidator("(({}))")
    if (scope.validate())
        println("Your code contains scopes.")
    else
        println("Your text hasn't scopes.")
}