
./mvnw clean package
docker login -u *** -p ***
docker build -t imalouhov/helm-homework:0.0.1 .
docker push imalouhov/helm-homework:0.0.1
cd "C:\Users\pusto\Documents\java projects\helm-homework\helm"
helm create helm-homework
helm install postgres ./helm/postgres
helm install user-service ./helm/user-service
kubectl exec -it postgres-deployment-596dc8f5d4-s5hpl -- psql -U admin -d users -c '\dt'
kubectl create configmap liquibase-changelog --from-file=liquibase/changelog/changelog.xml


curl http://arch.homework:80/test


172.17.107.125
172.24.10.222:32029
kubectl get pod
kubectl logs helm-homework-deployment-75dfdb764c-hbzgj
kubectl logs helm-homework-deployment-75dfdb764c-kgnrh -c liquibase

http://127.0.0.1:80/?key=admin
http://arch.homework:80/?key=admin
http://172.17.107.125:30200/?key=admin
helm del $(helm ls --all --short)



#Run Windows PowerShell as Administrator:
Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All
minikube start --vm-driver hyperv
minikube addons enable ingress
#Turn on vpn
helm repo add bitnami https://charts.bitnami.com/bitnami
helm repo update
helm install postgres -f helm-homework/postgres-values.yaml bitnami/postgresql
curl http://arch.homework:80/test

helm del $(helm ls --all --short)






helm install postgres bitnami/postgresql -f pgdb-values.yaml --set postgresqlPassword=password --set persistence.enabled=true --set persistence.size=8Gi --set service.type=ClusterIP --set postgresqlDatabase=db --set service.port=5432
helm install pgdb -f pgdb-values.yaml bitnami/postgresql -n otus

helm repo add runix https://helm.runix.net
helm install pgadmin4 runix/pgadmin4
helm repo update
helm install pgadmin4 runix/pgadmin4 --set pgadminUsername=admin --set pgadminPassword=admin --set service.type=LoadBalancer