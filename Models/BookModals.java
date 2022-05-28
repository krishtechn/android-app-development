package com.example.firstapp.Models;

public class BookModals {
    int Bookimage;
    String Bookname;

    public BookModals(int bookimage, String bookname) {
        Bookimage = bookimage;
        Bookname = bookname;
    }

    public int getBookimage() {
        return Bookimage;
    }

    public void setBookimage(int image) {
        Bookimage = image;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }
}
