package org.javaCertificationPractice;

public interface Readable {
    public void readBook();
    public void setBookMark();
}
abstract class Book implements Readable{
    public void readBook(){}
}
class EBook extends Book{
    @Override
    public void readBook() {
        super.readBook();
    }

    @Override
    public void setBookMark() {

    }
}
