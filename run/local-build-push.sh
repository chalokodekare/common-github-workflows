source run/common.sh
acr-resource-name=your-acr-resource-name

gradle bootjar

docker buildx build --build-arg app=$app --build-arg version=$version \
  --tag $acr-resource-name.azurecr.io/$app:$buildTag .

az acr login --name $acr-resource-name

docker push $acr-resource-name.azurecr.io/$app:$buildTag

cmd /k
