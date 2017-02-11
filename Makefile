all: clean build run

clean:
	-rm ./Main.class
build:
	javac Main.java
run:
	java Main
