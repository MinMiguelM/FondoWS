package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_package_servers database table.
 * 
 */
@Entity
@Table(name="smf_package_servers")
@NamedQuery(name="SmfPackageServer.findAll", query="SELECT s FROM SmfPackageServer s")
public class SmfPackageServer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_server")
	private int idServer;

	private String name;

	private String url;

	public SmfPackageServer() {
	}

	public int getIdServer() {
		return this.idServer;
	}

	public void setIdServer(int idServer) {
		this.idServer = idServer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}