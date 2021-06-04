# Etcd3 Discovery Provider

This project contains an OSGi bundle implementing an ECF Discovery Provider for discovering [OSGi Remote Services](https://wiki.eclipse.org/OSGi_Remote_Services_and_ECF) based upon [Etcd](https://etcd.io/) version 3.

Etcd3 provides a popular server/service to reliably store, retrieve, and watch key-value pairs and is used in [Kubernetes](https://kubernetes.io/).   

This discovery provider allows an Etcd3 server to be used to publish and discover OSGi Remote Service endpoints via Etcd3 client->server protocols.   

With this bundle OSGi Remote Services will automatically be published to an Etcd3 server and discovered by other OSGi Remote Service consumers that are using the same Etcd3 server.
