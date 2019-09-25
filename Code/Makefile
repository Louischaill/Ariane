JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java -implicit:none -encoding UTF8


CLASSES= \
		AlgoDeterministe.java  \
        AlgoRand.java \
        AlgoDeterMan.java \
        AlgoDeterministeMan.java \
        AlgoRandMan.java \
        Analyse.java \
        Choix.java   \
        CopieGrille.java \
        FenDeterchoix.java \
        ChoixAlecture.java \
        Ecriture.java  \
        FenCrea.java  \
        Fenetre2.java \
        FenManAuto.java\
        GrilleCrea.java  \
        GrilleTest.java \
        JFile.java  \
        Lecture.java  \
        Manuel.java  \
        ManuelDeter.java \
        Observateur2.java \
        Observateur.java  \
        Observateur3.java \
        VueAide.java  \
        VueDossier.java  \
        Main.java 


classes: $(CLASSES:.java=.class)

run:
	java Main
clean :
	$(RM) *.class
