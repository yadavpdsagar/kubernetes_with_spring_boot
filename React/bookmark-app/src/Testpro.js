import React, { useState, useEffect } from "react";
import { useForm, Controller } from "react-hook-form";
import { Dropdown } from "primereact/dropdown";
import { MultiSelect } from "primereact/multiselect";
import { Button } from "primereact/button";

const Testpro = () => {
  const [dynamicApiList, setDynamicApiList] = useState([
    {
      id: 111,
      name: "test",
      fields: "testfield1,testfield2,testfield21",
    },
    {
      id: 112,
      name: "test2",
      fields: "testfield1254,testfield12545,testfield125478",
    },
    {
      id: 113,
      name: "test3",
      fields: "testfield125498,testfield125412,testfield125436",
    },
    {
      id: 114,
      name: "test4",
      fields: "testfield125448,testfield125452,testfield125438",
    },
    {
      id: 115,
      name: "test5",
      fields:
        "testfield125486,testfield1254753,testfield1254158,testfield1254548,testfield1254sd",
    },
  ]);
  const [fieldsOptions, setFieldsOptions] = useState([]);
  const {
    control,
    handleSubmit,
    setValue,
    formState: { errors },
  } = useForm();

  // Handle Name Selection to update available fields
  const handleNameChange = (selectedName) => {
    const selectedItem = dynamicApiList.find(
      (item) => item.name === selectedName
    );
    const fields = selectedItem ? selectedItem.fields.split(",") : [];
    setFieldsOptions(fields);

    setValue("fields", fields); // Set default values in MultiSelect
  };

  // Handle Form Submission
  const onSubmit = (formData) => {
    const payload = {
      name: formData.name,
      fields: formData.fields.join(","), // Join fields into a comma-separated string
    };

    console.log("Data to be saved: ", payload);
    // Call API or dispatch Redux action here
  };

  return (
    <div className="p-4">
      <h1>Forredux Data</h1>

      <form onSubmit={handleSubmit(onSubmit)}>
        <div className="formgrid grid">
          {/* Dropdown for Name Selection */}
          <div className="field col">
            <label htmlFor="name">Select Name</label>
            <Controller
              name="name"
              control={control}
              defaultValue=""
              rules={{ required: "Name is required" }}
              render={({ field }) => (
                <Dropdown
                  {...field}
                  id="name"
                  options={dynamicApiList.map((item) => ({
                    label: item.name,
                    value: item.name,
                  }))}
                  placeholder="Select a name"
                  onChange={(e) => {
                    field.onChange(e.value);
                    handleNameChange(e.value);
                  }}
                  className="p-inputtext"
                />
              )}
            />
          </div>

          {/* Always Visible MultiSelect for Fields */}
          <div className="field col">
            <label htmlFor="fields">Select Fields</label>
            <Controller
              name="fields"
              control={control}
              defaultValue={[]}
              rules={{ required: "At least one field is required" }}
              render={({ field }) => (
                <MultiSelect
                  {...field}
                  id="fields"
                  options={fieldsOptions.map((field) => ({
                    label: field,
                    value: field,
                  }))}
                  value={field.value || []}
                  onChange={(e) => field.onChange(e.value)}
                  placeholder="Select fields"
                  optionLabel="label"
                  display="chip"
                  className="p-inputtext"
                />
              )}
            />
          </div>
        </div>

        <div className="field">
          <Button label="Submit" icon="pi pi-check" type="submit" />
        </div>
      </form>
    </div>
  );
};

export default Testpro;
