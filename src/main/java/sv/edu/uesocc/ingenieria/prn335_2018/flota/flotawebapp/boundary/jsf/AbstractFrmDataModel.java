/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.boundary.jsf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.LazyDataModel;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.Marca;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.Modelo;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.Parte;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.TipoVehiculo;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.control.AbstractFacade;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.control.EstadoCRUD;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.control.ModeloFacade;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.control.ParteFacade;

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
    
      @Inject
    private ModeloFacade modelofacade;
    @Inject
    private ParteFacade partefacade;        

     List<Parte> listparte;
    
    List<Modelo> listmodelo;
    Modelo modelo;
    TipoVehiculo tipovehiculo;
    Marca marca;
    Parte parte;
    private EstadoCRUD estado;

    public void inicializar() {
        modelo = new Modelo();
        tipovehiculo = new TipoVehiculo();
        marca = new Marca();
        this.crearTablaModelo();
        this.crearTablaParte();
        
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


 public List<Modelo> crearTablaModelo(){
        listmodelo = new ArrayList();      
        try {
           listmodelo = modelofacade.findAll(); 
        } catch (Exception ex) {
            this.listmodelo = Collections.EMPTY_LIST;
        } return this.listmodelo;
    }
    
    public List<Parte> crearTablaParte(){
        listparte = new ArrayList();      
        try {
           listparte = partefacade.findAll(); 
        } catch (Exception ex) {
            this.listparte = Collections.EMPTY_LIST;
        } return this.listparte;
    }

    public ModeloFacade getModelofacade() {
        return modelofacade;
    }

    public void setModelofacade(ModeloFacade modelofacade) {
        this.modelofacade = modelofacade;
    }

    public ParteFacade getPartefacade() {
        return partefacade;
    }

    public void setPartefacade(ParteFacade partefacade) {
        this.partefacade = partefacade;
    }

    public List<Parte> getListparte() {
        return listparte;
    }

    public void setListparte(List<Parte> listparte) {
        this.listparte = listparte;
    }

    public List<Modelo> getListmodelo() {
        return listmodelo;
    }

    public void setListmodelo(List<Modelo> listmodelo) {
        this.listmodelo = listmodelo;
    }


    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(TipoVehiculo tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Parte getParte() {
        return parte;
    }

    public void setParte(Parte parte) {
        this.parte = parte;
    }

     public void onRowSelect(SelectEvent event) {
        modelo = (Modelo) event.getObject();
        this.estado = EstadoCRUD.EDITAR;
    }

    public void onRowDeselect(UnselectEvent event) {
        this.estado = EstadoCRUD.NUEVO;
        this.modelo = new  Modelo();
       
    }

    public EstadoCRUD getEstado() {
        return estado;
    }

    public void setEstado(EstadoCRUD estado) {
        this.estado = estado;
    }
    
}
