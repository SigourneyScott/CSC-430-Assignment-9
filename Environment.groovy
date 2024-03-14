import values.ValV

package environments
class Env {
    List<Binding> vars

    Env(vars) {
        this.vars = vars
    }
}

class Binding {
    String name
    ValV val

    Binding(name, val) {
        this.name = name
        this.val = val
    }
}