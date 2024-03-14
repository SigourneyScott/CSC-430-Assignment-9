import expressions.ExprC
import environment.Env

package values
interface ValV {

}

class NumV implements ValV {
    Integer n

    NumV(n) {
        this.n = n
    }
}

class BoolV implements ValV {
    boolean b

    BoolV(b) {
        this.b = b
    }
}

class StrV implements ValV {
    String str

    StrV(str) {
        this.str = str
    }
}

class CloV implements ValV {
    List<String> params
    ExprC body
    Env cloEnv

    CloV(params, body, cloEnv) {
        this.params = params
        this.body = body
        this.cloEnv = cloEnv
    }
}

/*class PrimV implements ValV {
    Runable expr

    PrimV(expr) {
        this.expr = expr
    }
}*/