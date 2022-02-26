/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.MDB;
import Vista.SeguimientoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorSeguimiento implements ActionListener{
  private SeguimientoCliente _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    
    public ControladorSeguimiento(SeguimientoCliente view, MDB model){
       this._model=model;
       this._view=view;
        this._view.btnAñadir.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
this._view.btnEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.btnAñadir){ //Si el botón presionado fue el de alta
         // System.out.print("paso");
        leyenda=_model.registrarAlta("tbusuarios"," null, ' " +_view.txtNombre.getText()+" ',' " +_view.txtApellidoPaterno.getText() +" ', "+_view.txtApellidoMaterno.getText() +" ', "+_view.txtEdad.getText() +" ', "+_view.txtDireccion.getText() +" ', "+_view.txtEstadoCivil.getText() +" ', "+_view.txtNumeroTelefonico.getText() +" ', "+_view.txtTelefonoCasa.getText() +" ', "+_view.txtEmail.getText());
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtNombre.setText(null);
_view.txtApellidoPaterno.setText(null);
_view.txtApellidoMaterno.setText(null);
_view.txtApellidoMaterno.setText(null);
_view.txtEdad.setText(null);
_view.txtDireccion.setText(null);
_view.txtEstadoCivil.setText(null);
_view.txtNumeroTelefonico.setText(null);
_view.txtTelefonoCasa.setText(null);
_view.txtEmail.setText(null);
}
}
