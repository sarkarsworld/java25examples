
// No need to provide Class name and brackets.
// Not recommended for extensive prod grade applications as we would loose lot of flexibility if we create class in morden way.
// these classes are generally final in nature (when created internally).
// these type of classes should have an launchable method, else we wont be able to call spec. methods.


// launchable method
void main() {
    IO.println("Hello from Compact Source files main method.");
    print();
}


void print(){
    IO.println("hello from print method.");
}