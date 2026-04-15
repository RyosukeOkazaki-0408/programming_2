.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java) $(wildcard id/*.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= DateIdTester
MAIN2	= DateIdTester2

all: $(CLASS)

test: $(CLASS)
	$(JAVA) $(MAIN)
	$(JAVA) $(MAIN2)

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f $(CLASS) 

