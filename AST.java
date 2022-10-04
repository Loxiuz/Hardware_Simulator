public abstract class AST {}

abstract class Expr extends AST{}

    class Identifier {

        public String id;

        public Identifier(String id) {
            this.id = id;
        }

        public String eval() {return id;}
    }
    class Const {

        public Integer c;

        public Const(Integer c) {
            this.c = c;
        }

        public Integer eval() {return c;}
    }
/*--------------------------------------------------*/
abstract class Command extends AST{
    abstract public boolean eval();
}
    class Hardware extends Command{
    

        @Override
        public boolean eval() {return false;}
    }
    class Inputs extends Command{


        @Override
        public boolean eval() {return false;}
    }
    class Outputs extends Command{


        @Override
        public boolean eval() {return false;}
    }
    class Latch extends Command{


        @Override
        public boolean eval() {return false;}
    }
    class Update extends Command{


        @Override
        public boolean eval() {return false;}
    }
    class Simulate extends Command{


        @Override
        public boolean eval() {return false;}
    }
/*--------------------------------------------------*/
abstract class Condition {
    abstract public boolean eval();
}
    class And extends Condition{

        Condition c1;
        Condition c2;

        public And(Condition c1, Condition c2){
            this.c1 = c1;
            this.c2 = c2;
        }
        public boolean eval(){return c1.eval() && c2.eval();}
    }
    class Negation extends Condition{

        Condition c1;

        public Negation(Condition c1){
            this.c1 = c1;
        }
        public boolean eval(){return !c1.eval();}
    }
/*--------------------------------------------------*/