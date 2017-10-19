Java 9 example
using junit
using Java Platform Module System(Jigsaw)

compile:

javac --module-path lib -d "target" $(find src -name "*.java")

run:

java --module-path=lib:target --add-modules org.accenture.online --module junit/org.junit.runner.JUnitCore org.accenture.online.ExerciseTest


etc:

cp ~/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar lib

