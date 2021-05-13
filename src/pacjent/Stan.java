package pacjent;

public enum Stan {
    normalny(true), zly(false) , krytyczny(false);
    boolean zdrowy;

    Stan(boolean zdrowy) {
        this.zdrowy = zdrowy;
    }
}
