command - 

```bash
docker run -d \
  -p 9393:9300 \
  -e CSVSERVER_BORDER=Orange \
  -v "$(pwd)/inputFile:/csvserver/inputdata" \
  infracloudio/csvserver:latest
