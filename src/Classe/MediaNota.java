package Classe;

public class MediaNota {
    private Double media;

    public Double getMedia() {
        return media;
    }

    public Double setRealizaMedia(Double notaN1, Double notaN2, Double notaAP) {
        double somaN2comAP = notaN2 + notaAP;
        double mediaN2comAP = somaN2comAP / 2;
        double somaN1comN2 = notaN1 + mediaN2comAP;
        double mediaN1comN2 = somaN1comN2 / 2;
        return media = mediaN1comN2;
    }

    public Double setRealizaMediaComN3(Double notaN1, Double notaN3) {
        double somaN1comN3 = notaN1 + notaN3;
        double mediaN1comN3 = somaN1comN3 / 2;

        return media = mediaN1comN3;
    }
}
