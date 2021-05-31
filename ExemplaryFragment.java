package Zadanie2;

public class ExemplaryFragment extends Fragment {

    private Uri imageUri;
    private ImageView thumbnail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(...);
    }

    // launcher z którego powinieneś skorzystać
    ActivityResultLauncher<Intent> photoPicker = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if(result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    assert data != null;
                    imageUri = data.getData();
                    thumbnail.setImageURI(imageUri);
                }
            }
    );

    private void pickPhoto() {
        // 2. tutaj należy dodać obiekt klasy Intent
        // i wykorzystać fukcję photoPicker.launch(Intent intent)
    }

}
