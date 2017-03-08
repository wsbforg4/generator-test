(ns com.atomist.generator-test.models.status
  (:require [schema.core :as s]))

(s/defschema Status
  "The status of this service"
  {:version s/Str
   :status  (s/enum "OK" "WARN" "ERROR")})
