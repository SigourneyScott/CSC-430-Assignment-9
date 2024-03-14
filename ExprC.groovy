package expressions
interface ExprC {

}

class IdC implements ExprC {
    String var

    IdC(var) {
        this.var = var
    }
}

class NumC implements ExprC {
    Integer n

    NumC(n) {
        this.n = n
    }
}

class StrC implements ExprC {
    String str

    StrC(str) {
        this.str = str
    }
}

class AppC implements ExprC {
    ExprC fun
    List<ExprC> args

    AppC(fun, args) {
        this.fun = fun
        this.args = args
    }
}

class LamC implements ExprC {
    List<String> params
    ExprC body

    LamC(params, body) {
        this.params = params
        this.body = body
    }
}

class IfC {
    ExprC ifExpr
    ExprC thenExpr
    ExprC elseExpr

    IfC(ifExpr, thenExpr, elseExpr) {
        this.ifExpr = ifExpr
        this.thenExpr = thenExpr
        this.elseExpr = elseExpr
    }
}