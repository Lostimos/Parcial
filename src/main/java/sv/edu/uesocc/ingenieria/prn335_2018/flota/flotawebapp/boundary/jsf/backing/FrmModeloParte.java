/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.boundary.jsf.backing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.Marca;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.Modelo;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.Parte;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.datos.definicion.TipoVehiculo;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.control.ModeloFacade;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.control.ModeloParteFacade;
import sv.edu.uesocc.ingenieria.prn335_2018.flota.flotawebapp.control.ParteFacade;


/**
 *
 * @author stany
 */

@Named
@ViewScoped
public class FrmModeloParte implements Serializable{

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
    
    
   
       
    public FrmModeloParte(){
        
    }
       
    public FrmModeloParte(ModeloParteFacade modeloParteFacade, ModeloFacade modeloFacade, ParteFacade parteFacade, Modelo registro) {
        
    }
    
    @PostConstruct
    public void inicializar(){
        modelo = new Modelo();
        tipovehiculo = new TipoVehiculo();
        marca = new Marca();
        this.crearTablaModelo();
        this.crearTablaParte();
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

    public List<Parte> getListaPartes() {
        return listparte;
    }

    public void setListaPartes(List<Parte> listaPartes) {
        this.listparte = listaPartes;
    }

    public List<Modelo> getListaModelo() {
        return listmodelo;
    }

    public void setListaModelo(List<Modelo> listaModelo) {
        this.listmodelo = listaModelo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipovehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipovehiculo = tipoVehiculo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
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

    public List<Modelo> getListModelo() {
        return listmodelo;
    }

    public void setListModelo(List<Modelo> listModelo) {
        this.listmodelo = listModelo;
    }

    public Parte getParte() {
        return parte;
    }

    public void setParte(Parte parte) {
        this.parte = parte;
    }
    
    
    
}