package org.eclipse.ecf.provider.etcd3.grpc.api;

import io.reactivex.Flowable;
import io.reactivex.Single;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: rpc.proto.  ")
public interface WatchService {

    
    /**
     * <pre>
     *  Range gets the keys in the range from the key-value store.
     * </pre>
     */
    default Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.WatchResponse> watch(Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.WatchRequest> requests)  {
        return null;
    }
}
