// A polymorphism problem


public class Baz extends Foo {
  public void method 1 (){
    System.out.println ("baz 1");
    public String toString(){
      return "Baz";
    }
  }

  public class Mumble extends Baz {
    public void method2() {
      System.out.println("mumble 2");
    }
  }
}

// What would be the output of the following client code ?


/* finding output with tables
method, Foo, Bar, Baz, Mumble
method1 foo12 bar2 foo2
=========================



*/

// Another problem2

public class Spam extends Yam {
  public void b() {
    System.out.print("Lamb b");


  }

}

public class Ham {
  public void a() {
    System.out.print("ham a  ");
    b();
  }

  public void b() {
    System.out.print("Ham b ");
  }

  public String toString() {
    return "Ham";
  }
}



/*

*/
