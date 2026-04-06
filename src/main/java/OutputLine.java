import static java.lang.IO.*;

// compact source class used (just as an ex).
void main() {

    IO.println("this is first line.");

    // since we have done the static import, we can directly use println()
    println("this is second line.");

    // input request from console.
    var input = IO.readln("what is your name ? ");
    println("hello {}" + input);

}
