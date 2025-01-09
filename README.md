./mvnw clean package  
docker login -u *** -p ***  
docker build -t imalouhov/helm-homework:0.0.1 .  
docker push imalouhov/helm-homework:0.0.1  

#Run Windows PowerShell as Administrator:  
Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All  
minikube start --vm-driver hyperv  
minikube addons enable ingress  

helm create postgres  
helm create user-service  

helm install postgres ./helm/postgres  
helm install user-service ./helm/user-service  

kubectl exec -it postgres-deployment-596dc8f5d4-4bgld -- psql -U admin -d users -c '\dt'  
kubectl logs helm-homework-deployment-794bc89f44-hkfx8  

helm del $(helm ls --all --short)