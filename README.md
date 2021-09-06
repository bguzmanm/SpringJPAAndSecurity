# Ejemplo de implementación Spring Security

## 3 de Septiembre

- Incluimos dependencias en POM.xml: spring-security.
- Incluimos filter y filter-mapper en web.xml
- incluimos en contextConfigLocation referencia a spring-security.xml
- Creamos spring-security.xml


## 6 de Septiembre

- Incluimos autenticación contra datos en base de datos.

Usamos esta tabla:

```sql
create table users 
    (username varchar2(20 byte) not null enable, 
    password varchar2(100 byte), 
    rol varchar2(20 byte), 
constraint users_pk primary key (username));
```

Recueda que las contraseñas deben estar encriptadas, utilza [esta herramienta](https://www.browserling.com/tools/bcrypt).