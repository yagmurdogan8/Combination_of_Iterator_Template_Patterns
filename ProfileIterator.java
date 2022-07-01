package ceng.anadolu.bim492;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
