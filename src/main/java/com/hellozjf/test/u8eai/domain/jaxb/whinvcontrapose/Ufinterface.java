//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:27:03 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.whinvcontrapose;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="i_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whinvcontrapose" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cwhcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="itopsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ilowsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="isafenum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="iwastage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ifrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cfrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="idays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dlastdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cwhpersoncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proxyvenwhall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="roottag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="billtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="docid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="receiver" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeexchanged" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exportneedexch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iId",
    "whinvcontrapose"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    @XmlElement(name = "i_id")
    protected String iId;
    protected List<Ufinterface.Whinvcontrapose> whinvcontrapose;
    @XmlAttribute(name = "roottag")
    protected String roottag;
    @XmlAttribute(name = "billtype")
    protected String billtype;
    @XmlAttribute(name = "docid")
    protected String docid;
    @XmlAttribute(name = "receiver")
    protected String receiver;
    @XmlAttribute(name = "sender")
    protected String sender;
    @XmlAttribute(name = "proc")
    protected String proc;
    @XmlAttribute(name = "codeexchanged")
    protected String codeexchanged;
    @XmlAttribute(name = "exportneedexch")
    protected String exportneedexch;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * 获取iId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIId() {
        return iId;
    }

    /**
     * 设置iId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIId(String value) {
        this.iId = value;
    }

    /**
     * Gets the value of the whinvcontrapose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whinvcontrapose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhinvcontrapose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Whinvcontrapose }
     * 
     * 
     */
    public List<Ufinterface.Whinvcontrapose> getWhinvcontrapose() {
        if (whinvcontrapose == null) {
            whinvcontrapose = new ArrayList<Ufinterface.Whinvcontrapose>();
        }
        return this.whinvcontrapose;
    }

    /**
     * 获取roottag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoottag() {
        return roottag;
    }

    /**
     * 设置roottag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoottag(String value) {
        this.roottag = value;
    }

    /**
     * 获取billtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltype() {
        return billtype;
    }

    /**
     * 设置billtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltype(String value) {
        this.billtype = value;
    }

    /**
     * 获取docid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocid() {
        return docid;
    }

    /**
     * 设置docid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocid(String value) {
        this.docid = value;
    }

    /**
     * 获取receiver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置receiver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * 获取sender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * 设置sender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * 获取proc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProc() {
        return proc;
    }

    /**
     * 设置proc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProc(String value) {
        this.proc = value;
    }

    /**
     * 获取codeexchanged属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeexchanged() {
        return codeexchanged;
    }

    /**
     * 设置codeexchanged属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeexchanged(String value) {
        this.codeexchanged = value;
    }

    /**
     * 获取exportneedexch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportneedexch() {
        return exportneedexch;
    }

    /**
     * 设置exportneedexch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportneedexch(String value) {
        this.exportneedexch = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cwhcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="itopsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ilowsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="isafenum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="iwastage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ifrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cfrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="idays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dlastdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cwhpersoncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proxyvenwhall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cwhcode",
        "cinvcode",
        "itopsum",
        "ilowsum",
        "isafenum",
        "iwastage",
        "ifrequency",
        "cfrequency",
        "idays",
        "dlastdate",
        "cwhpersoncode",
        "proxyvenwhall"
    })
    public static class Whinvcontrapose {

        protected String cwhcode;
        protected String cinvcode;
        protected String itopsum;
        protected String ilowsum;
        protected String isafenum;
        protected String iwastage;
        protected String ifrequency;
        protected String cfrequency;
        protected String idays;
        protected String dlastdate;
        protected String cwhpersoncode;
        protected String proxyvenwhall;

        /**
         * 获取cwhcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCwhcode() {
            return cwhcode;
        }

        /**
         * 设置cwhcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCwhcode(String value) {
            this.cwhcode = value;
        }

        /**
         * 获取cinvcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCinvcode() {
            return cinvcode;
        }

        /**
         * 设置cinvcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCinvcode(String value) {
            this.cinvcode = value;
        }

        /**
         * 获取itopsum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItopsum() {
            return itopsum;
        }

        /**
         * 设置itopsum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItopsum(String value) {
            this.itopsum = value;
        }

        /**
         * 获取ilowsum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIlowsum() {
            return ilowsum;
        }

        /**
         * 设置ilowsum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIlowsum(String value) {
            this.ilowsum = value;
        }

        /**
         * 获取isafenum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsafenum() {
            return isafenum;
        }

        /**
         * 设置isafenum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsafenum(String value) {
            this.isafenum = value;
        }

        /**
         * 获取iwastage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIwastage() {
            return iwastage;
        }

        /**
         * 设置iwastage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIwastage(String value) {
            this.iwastage = value;
        }

        /**
         * 获取ifrequency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIfrequency() {
            return ifrequency;
        }

        /**
         * 设置ifrequency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIfrequency(String value) {
            this.ifrequency = value;
        }

        /**
         * 获取cfrequency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfrequency() {
            return cfrequency;
        }

        /**
         * 设置cfrequency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfrequency(String value) {
            this.cfrequency = value;
        }

        /**
         * 获取idays属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdays() {
            return idays;
        }

        /**
         * 设置idays属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdays(String value) {
            this.idays = value;
        }

        /**
         * 获取dlastdate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDlastdate() {
            return dlastdate;
        }

        /**
         * 设置dlastdate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDlastdate(String value) {
            this.dlastdate = value;
        }

        /**
         * 获取cwhpersoncode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCwhpersoncode() {
            return cwhpersoncode;
        }

        /**
         * 设置cwhpersoncode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCwhpersoncode(String value) {
            this.cwhpersoncode = value;
        }

        /**
         * 获取proxyvenwhall属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyvenwhall() {
            return proxyvenwhall;
        }

        /**
         * 设置proxyvenwhall属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyvenwhall(String value) {
            this.proxyvenwhall = value;
        }

    }

}
