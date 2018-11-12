/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.boundary.jsf;

import java.util.List;
import java.util.stream.Collectors;
import javax.faces.event.ActionEvent;
import org.primefaces.model.LazyDataModel;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.Modelo;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.control.AbstractFacade;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.control.ModeloFacade;

/**
 *
 * @author Stany
 * @param <p>
 */
public abstract class AbstractFrmDataModel<p> {
    
    private LazyDataModel<Modelo> modelom;
    private ModeloFacade Facademodelo;
    private List<Modelo> listamodo;
    private AbstractFacade absfaca;
    protected Modelo registro;
    

    public void inicializar() {
        //To change body of generated methods, choose Tools | Templates.
    }
    
    public void crearNuevo() {
       
    }
   public Object clavePorDatos(Modelo object) {
        
        return null;
    }
    public Modelo datosPorClave(String rowkey) {
      
        return null;
    }
    public AbstractFacade getFacade() {
        return null;
    }

    public void btnCancelarHandler(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LazyDataModel<Modelo> getModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void btnEliminarHandler(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LazyDataModel<Modelo> getModelom() {
        return modelom;
    }

    public void setModelom(LazyDataModel<Modelo> modelom) {
        this.modelom = modelom;
    }

    public ModeloFacade getFacademodelo() {
        return Facademodelo;
    }

    public void setFacademodelo(ModeloFacade Facademodelo) {
        this.Facademodelo = Facademodelo;
    }

    public List<Modelo> getListamodo() {
        return listamodo;
    }

    public void setListamodo(List<Modelo> listamodo) {
        this.listamodo = listamodo;
    }

    public AbstractFacade getAbsfaca() {
        return absfaca;
    }

    public void setAbsfaca(AbstractFacade absfaca) {
        this.absfaca = absfaca;
    }

    public Modelo getRegistro() {
        return registro;
    }

    public void setRegistro(Modelo registro) {
        this.registro = registro;
    }



    
}
