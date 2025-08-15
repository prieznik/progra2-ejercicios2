package Ejercicio4;

public class TempMinEstacion {
    private float[] S;

    // constructor
    public TempMinEstacion(int cantidad) {
        S = new float[cantidad];
    }

    // comandos
    public void establecerTempMin(int i, float elem){
        S[i]=elem;
    }

    // consultas
    public float mayorTempMin(){
        float mayor= S[0];
        for (int i=0; i<S.length; i++){
            if (S[i]>mayor){
                mayor= S[i];
            }
        } return mayor;
    }

    public float promedioTempMin(){
        float promedio= 0.0F;
        for (int i=0; i<S.length ; i++){
            promedio+=S[i];
        } return promedio/=S.length;
    }

    public int cantHeladas(){
        int cant = 0;
        for (int i=0; i<S.length; i++){
            if (S[i]<0){
                cant++;
            }
        } return cant;
    }

    public boolean huboHeladas(){
        if (cantHeladas()>0){
            return true;
        } else return false;
    }

    public float primeroMayor(float t){
        for (int i=0; i<S.length; i++){
            if (S[i]>t){
                return S[i];
            }
        } return t;
    }

    public boolean ordenadoCreciente(){
        boolean flag= true;
        for (int i=1; i<S.length; i++){
            if (S[i]<S[i-1]){
                flag= false;
            }
        } return flag;
    }


}
