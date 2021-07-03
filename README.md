# Etcd3 Discovery Provider

This project contains an OSGi bundle implementing an ECF Discovery Provider for discovering [OSGi Remote Services](https://wiki.eclipse.org/OSGi_Remote_Services_and_ECF) based upon [Etcd](https://etcd.io/) version 3.

ECF discovery provider that uses etcd3 service to publish and discover remote service endpoint descriptions.   See https://github.com/coreos/etcd to download, install, and configure the etcd server.   

This provider used an etcd server to publish and discover Remote Services.   It's necessary to install the provider bundle:  org.eclipse.ecf.provider.etcd3, and configure it so that it points to a running etcd server/service.

Released versions of this bundle are available at [Maven Central](https://search.maven.org/search?q=a:org.eclipse.ecf.provider.etcd3)

For this provider to work, an etcd server must be running at some available hostname and port before the process using the etcd provider is started.  Note that when the provider is started, it will immediately attempt to connect to the etcd server.  If that connection cannot be made it will result in an ERROR to the OSGi log.

The entire list of configurable properties for the etcd provider is in [this class](https://github.com/ECF/etcd-provider/blob/master/bundles/org.eclipse.ecf.provider.etcd/src/org/eclipse/ecf/provider/etcd/EtcdDiscoveryContainerConfig.java)

The most important properties are:

| Property Name | Default Value |
| --- | --- |
| ecf.discovery.etcd3.disabled | false |
| ecf.discovery.etcd3.protocol | http |
| ecf.discovery.etcd3.hostname | 127.0.0.1 |
| ecf.discovery.etcd3.port | 2379 |
| ecf.discovery.etcd3.keyPrefix | org.eclipse.ecf.provider.etcd3.EtcdDiscoveryContainer |
| ecf.discovery.etcd3.usePlaintext | false |
| ecf.discovery.etcd3.ttl | 30 (seconds) |
| ecf.discovery.etcd3.retry | false |

For example, to set the etcd server to:  'disco.ecf-project.org' set the java system propery...e.g. 

<other java start params> -Decf.discovery.etcd.hostname=disco.ecf-project.org

LICENSE
=======

The ECF etcd3 discovery provider is distributed with the Apache 2 license. See LICENSE in this directory for more
information.
