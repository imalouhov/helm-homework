
./mvnw clean package
docker login -u *** -p ***
docker build -t imalouhov/helm-homework:0.0.1 .
docker push imalouhov/helm-homework:0.0.1
helm create helm-homework
helm install helm-homework ./helm-homework
curl http://arch.homework:80/test


172.17.111.199
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