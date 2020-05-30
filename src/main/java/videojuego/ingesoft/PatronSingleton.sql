//Patron Singleton
    
    //1.Creando una variable estática que sea unica para todo el programa
    private static Personaje personaje;
    
    //2.Crear un constructor por defecto con modificador de acceso privado
    private Personaje(){
        
    }
    
    //3.Crear un metodo para generar la instancia (Solo la primera vez que lo
    //invoquen) y retornarla
    public Personaje getInstance(){
        if(personaje == null){
            personaje = new Personaje();
        }
        return personaje;
    }
    //Termina Patron Singleton

