package lab6p2_víctorromero;

import java.util.Date;

public class Singles extends Lanzamiento {

    private Cancion single;

    public Singles() {
        super();
    }

    public Singles(Cancion single, String titulo, Date fecha, int contLikes) {
        super(titulo, fecha, contLikes);
        this.single = single;
    }

    public Cancion getSingle() {
        return single;
    }

    public void setSingle(Cancion single) {
        this.single = single;
    }

    @Override
    public String toString() {
        return " >>SINGLE<< " + "\n"
                + "Single=" + single + '}';
    }

}
