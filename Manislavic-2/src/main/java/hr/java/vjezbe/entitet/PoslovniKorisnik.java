package hr.java.vjezbe.entitet;

public final class PoslovniKorisnik extends Korisnik implements Recenzent {
    private String naziv;
    private String web;

    public PoslovniKorisnik(String email, String telefon, String naziv, String web) {
        super(email, telefon);
        this.naziv = naziv;
        this.web = web;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String dohvatiKontakt() {
        return "Naziv tvrtke: " + this.getNaziv() + " " +
                ", mail: " + super.getEmail() +
                ", web: " + this.getWeb() +
                ", tel: " + super.getTelefon();
    }

    @Override
    public void ostaviRecenziju(Artikl artikl, Recenzija recenzija) {
        artikl.recenzije.add(recenzija);
    }
}
