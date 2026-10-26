void main() {
    int vize1 = 60;
    int vize2 = 70;
    int finals = 75;
    double ort = vize1 / 4.0 + vize2 / 4.0 + finals / 2.0;

    if(85<=ort){
        System.out.println("Takdir Belgesi Aldın!");
    }
    else if(75<=ort){
        System.out.println("Teşekkür Belgesi Aldın!");
    }
    else if(50<=ort){
        System.out.println("Geçtin!");
    }
    else{
        System.out.println("Kaldın :(");
    }


}