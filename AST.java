public abstract class AST {}

/*--------------------------------------------------*/
abstract class Hardware extends AST{
    class H extends Hardware {}
}
abstract class Inputs extends AST{
    class I extends Inputs {}
}
abstract class Outputs extends AST{
    class O extends Outputs {}
}
abstract class LatchDec extends AST{
    class L extends LatchDec {}
}
abstract class Update extends AST{
    class U extends Update {}
}
abstract class UpdateDec extends AST{
    class UD extends UpdateDec {}
}
abstract class Simulate extends AST{
    class S extends Simulate {}
}
abstract class Simlnp extends AST{
    class SL extends Simlnp {}
}
/*--------------------------------------------------*/
abstract class Expr extends AST {
    abstract public boolean eval();
}
    class And extends Expr {

        Expr c1;
        Expr c2;

        public And(Expr c1, Expr c2){
            this.c1 = c1;
            this.c2 = c2;
        }
        public boolean eval(){return c1.eval() && c2.eval();}
    }
    class Or extends Expr{

        Expr c1;
        Expr c2;

        public Or(Expr c1, Expr c2){
            this.c1 = c1;
            this.c2 = c2;
        }
        public boolean eval(){return c1.eval() || c2.eval();}
    }
    class Negation extends Expr {

        Expr c1;

        public Negation(Expr c1){
            this.c1 = c1;
        }
        public boolean eval(){return !c1.eval();}
    }
    class Identifier {

        public String id;

        public Identifier(String id) {
            this.id = id;
        }

        public String eval() {return id;}
    }
    class Const {

        public Integer c;

        public Const(Integer c) {this.c = c;}

        public Integer eval() {return c;}
    }
/*--------------------------------------------------*/