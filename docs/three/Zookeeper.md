#zookeeper

####关键词

#####Leader
写入
#####Follower
读，参与选举，过半写成功
#####Observer
读

建议建立集群节点数为奇数，只要超过一半的机器能够正常提供服务，
那么整个集群都是可用状态

#####Znode
数据节点，分为持久节点，临时节点，顺序节点
持久节点是指只要被创建，除非主动移除，否则都应该一直保存在Zookeeper中。
临时节点不同的是，他的生命周期和客户端Session会话一样，会话失效，那么临时节点就会被移除。
还有就是临时顺序节点和持久顺序节点，除了基本的特性之外，子节点的名称还具有有序性。


#####Session
指客户端跟服务端的通信，使用TCP的方式长链接保持通信。
有心跳机制，接收来自服务端的Watch通知

#####权限控制ACL
CREATE，创建子节点权限
DELETE，删除子节点权限
READ，获取节点数据和子节点列表权限
WRITE，更新节点权限
ADMIN，设置节点ACL权限

######特点
适用于读多写少的场景，切存储的数据量不能太大


####应用场景
* 名服务Name Service，依赖Zookeeper可以生成全局唯一的节点ID，来对分布式系统中的资源进行管理。
* 分布式协调，这是Zookeeper的核心使用了。利用Wather的监听机制，一个系统的某个节点状态发生改变，另外系统可以得到通知。
* 集群管理，分布式集群中状态的监控和管理，使用Zookeeper来存储。
* Master选举，利用Zookeeper节点的全局唯一性，同时只有一个客户端能够创建成功的特点，可以作为Master选举使用，创建成功的则作为Master。
分布式锁，利用Zookeeper创建临时顺序节点的特性。

#####Watch监听机制的原理（服务端）
