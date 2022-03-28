package Abstraccion02;
//CREAR UNA INTERFAZ LLAMADA "CONTROLES" QUE TENGA LOS SIGUIENTES METODOS
//encender:metodo que no recibe ningun parametro ni devuelve nada, pero cambia el estado de la television a true
//apagar:Metodo que no recibe ningun parametro ni devuelve nada, pero cambia el estado de la television
//cambiar canal: metodo que recibe el id del canal y solo cambia de canal cuando la tele esta encendida , el canal es distinto al actual
//y el canal es mayor que 0
public interface Controles {
	public void encender();
	public void apagar();
	public void cambiarCanal(int algo);
}
