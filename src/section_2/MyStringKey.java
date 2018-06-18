package section_2;

public final class MyStringKey {

    private final String kay;

    public MyStringKey(String kay) {
        this.kay = kay;
    }

    public String getKay() {
        return kay;
    }

    @Override
    public int hashCode() {
        return kay.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return kay.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return kay;
    }
}
