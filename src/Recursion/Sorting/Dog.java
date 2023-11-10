package Recursion.Sorting;

import java.util.Objects;

class Dog implements Comparable<Dog>{

    private final String nickname;

    public Dog(String nickname){
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return nickname;
    }

    @Override
    public int compareTo(Dog o) {
        return this.nickname.compareTo(o.nickname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(nickname, dog.nickname);
    }

    /* Вам предстоит реализовать метод compareTo и, возможно, equals —
    подумайте, какая между ними связь. */
}
