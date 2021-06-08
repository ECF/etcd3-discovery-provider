package org.eclipse.ecf.provider.etcd3.grpc.api;

import io.reactivex.Flowable;

@javax.annotation.Generated(
value = "by grpc-osgi-generator (REACTIVEX) - A protoc plugin for ECF's grpc remote services distribution provider at https://github.com/ECF/grpc-RemoteServiceSProvider ",
comments = "Source: rpc.proto.  ")
public interface WatchService {

    
    /**
     * <pre>
     *  Watch watches for events happening or that have happened. Both input and output
     *  are streams; the input stream is for creating and canceling watchers and the output
     *  stream sends events. One watch RPC can watch on multiple key ranges, streaming events
     *  for several watches at once. The entire event history can be watched starting from the
     *  last compaction revision.
     * </pre>
     */
    default Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.WatchResponse> watch(Flowable<org.eclipse.ecf.provider.etcd3.grpc.api.WatchRequest> requests)  {
        return null;
    }
}
