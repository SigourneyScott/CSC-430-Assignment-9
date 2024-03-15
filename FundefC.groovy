package fundef

class FunDefC {
    Symbol name
    List<Symbol> arg
    ExprC body

    FunDefC(Symbol name, List<Symbol> arg, ExprC body) {
        this.name = name
        this.arg = arg
        this.body = body
    }
}
