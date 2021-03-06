/*
The MIT License (MIT)

Copyright (c) 2015 Los Andes University

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package co.edu.uniandes.csw.concesionario.dtos.minimum;

import co.edu.uniandes.csw.concesionario.entities.CarEntity;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @generated
 */
@XmlRootElement
public class CarDTO  implements Serializable{

    private Long id;
    private String name;
    private String image;
    private Long price;
    private Long revisions;
    private Long warranty;


    /**
     * @generated
     */
    public CarDTO() {
    }

    /**
     * Crea un objeto CarDTO a partir de un objeto CarEntity.
     *
     * @param entity Entidad CarEntity desde la cual se va a crear el nuevo objeto.
     * @generated
     */
    public CarDTO(CarEntity entity) {
	   if (entity!=null){
        this.id=entity.getId();
        this.name=entity.getName();
        this.image=entity.getImage();
        this.price=entity.getPrice();
        this.revisions=entity.getRevisions();
        this.warranty=entity.getWarranty();
       }
    }

    /**
     * Convierte un objeto CarDTO a CarEntity.
     *
     * @return Nueva objeto CarEntity.
     * @generated
     */
    public CarEntity toEntity() {
        CarEntity entity = new CarEntity();
        entity.setId(this.getId());
        entity.setName(this.getName());
        entity.setImage(this.getImage());
        entity.setPrice(this.getPrice());
        entity.setRevisions(this.getRevisions());
        entity.setWarranty(this.getWarranty());
    return entity;
    }

    /**
     * Obtiene el atributo id.
     *
     * @return atributo id.
     * @generated
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el valor del atributo id.
     *
     * @param id nuevo valor del atributo
     * @generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el atributo name.
     *
     * @return atributo name.
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el valor del atributo name.
     *
     * @param name nuevo valor del atributo
     * @generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el atributo image.
     *
     * @return atributo image.
     * @generated
     */
    public String getImage() {
        return image;
    }

    /**
     * Establece el valor del atributo image.
     *
     * @param image nuevo valor del atributo
     * @generated
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Obtiene el atributo price.
     *
     * @return atributo price.
     * @generated
     */
    public Long getPrice() {
        return price;
    }

    /**
     * Establece el valor del atributo price.
     *
     * @param price nuevo valor del atributo
     * @generated
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * Obtiene el atributo revisions.
     *
     * @return atributo revisions.
     * @generated
     */
    public Long getRevisions() {
        return revisions;
    }

    /**
     * Establece el valor del atributo revisions.
     *
     * @param revisions nuevo valor del atributo
     * @generated
     */
    public void setRevisions(Long revisions) {
        this.revisions = revisions;
    }

    /**
     * Obtiene el atributo warranty.
     *
     * @return atributo warranty.
     * @generated
     */
    public Long getWarranty() {
        return warranty;
    }

    /**
     * Establece el valor del atributo warranty.
     *
     * @param warranty nuevo valor del atributo
     * @generated
     */
    public void setWarranty(Long warranty) {
        this.warranty = warranty;
    }


}
