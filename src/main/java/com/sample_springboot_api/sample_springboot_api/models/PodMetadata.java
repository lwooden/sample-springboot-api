package com.sample_springboot_api.sample_springboot_api.models;

public class PodMetadata {
    public String Node;
	public String PodName;
    public String PodIP;
    public String PodNamespace;
    public String PodServiceAccount;

    public PodMetadata(String node, String podname, String podip, String podnamespace, String podservice) {
        this.Node = node;
        this.PodName = podname;
        this.PodIP = podip;
        this.PodNamespace = podnamespace;
        this.PodServiceAccount = podservice;
    }

    public String getNode() {
        return Node;
    }
    public void setNode(String node) {
        Node = node;
    }
    public String getPodName() {
        return PodName;
    }
    public void setPodName(String podName) {
        PodName = podName;
    }
    public String getPodIP() {
        return PodIP;
    }
    public void setPodIP(String podIP) {
        PodIP = podIP;
    }
    public String getPodNamespace() {
        return PodNamespace;
    }
    public void setPodNamespace(String podNamespace) {
        PodNamespace = podNamespace;
    }
    public String getPodServiceAccount() {
        return PodServiceAccount;
    }
    public void setPodServiceAccount(String podServiceAccount) {
        PodServiceAccount = podServiceAccount;
    }
}
    
